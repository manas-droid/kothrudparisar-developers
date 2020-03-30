class TreeNode{
TreeNode left,right;
int data;
int pos;
TreeNode(int data,int pos)
{
  left =null; right =null;
  this.data = data;
  this.pos = pos;
}
}

class Solution
{
  public TreeNode buildTree(int[] inorder, int[] postorder) {
    TreeNode root = null;
    TreeNode tempRoot;
    int j;
    for(int i=postorder.length-1 ; i>=0;i--)
    {
        for(j=0;j<inorder.length;j++)
        {
            if(inorder[j] == postorder[i])
                break;
        }
        if(root == null)
        {
            root = new TreeNode(postorder[i],j);
        }
        else
        {
            tempRoot = root;
            for(int k=0;k<postorder.length-i;k++)
            {
                if(tempRoot.pos>j && tempRoot.left == null)
                {
                    tempRoot.left = new TreeNode(postorder[i],j);
                    break;
                }
                else if(tempRoot.pos>j && tempRoot.left!=null)
                {
                    tempRoot = tempRoot.left;
                }

               else if(tempRoot.pos<j && tempRoot.right==null)
                {
                    tempRoot.right = new TreeNode(postorder[i],j);
                    break;
                }
                else
                    tempRoot = tempRoot.right;
            }


        }
    }
      return root;
}
void display(TreeNode root)//preorder
{
  if(root == null)
    return;
  System.out.println(root.data);
  if(root.left!=null)
    display(root.left);
  if(root.right!=null)
    display(root.right);
}

  public static void main(String[] args) {
    int postorder[] = {4,5,2,3,1}; //you can put the inputs here.
    int inorder [] = {4,2,5,1,3}; //here too!!
    Solution s = new Solution();
    TreeNode root = s.buildTree(inorder,postorder);
    s.display(root);
  }

}
