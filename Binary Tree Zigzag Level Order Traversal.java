class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> items = new ArrayList<>();
        if(root==null) return items;
        Deque<TreeNode> oq = new ArrayDeque<>();
        oq.offer(root);
        boolean l2r = true; int size=0;
        while(!oq.isEmpty()){
            size = oq.size();
            Deque<Integer> lq = new ArrayDeque<>();
            for(int ind=0;ind<size;ind++){
                TreeNode cur = oq.poll();
                if(l2r) lq.offer(cur.val);
                else lq.offerFirst(cur.val);
                if(cur.left!=null) oq.offer(cur.left);
                if(cur.right!=null) oq.offer(cur.right);
            }
            items.add(new ArrayList<>(lq));
            l2r=!l2r;

        }
        return items;
    }
}
