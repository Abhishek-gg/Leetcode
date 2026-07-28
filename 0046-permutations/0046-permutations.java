class Solution {
    List<List<Integer>> res = new ArrayList<>();

    private void DFS(List<Integer> ip, List<Integer> op) {
        if (ip.isEmpty()) {
            res.add(new ArrayList<>(op));
            return;
        }

        for (int i = 0; i < ip.size(); i++) {
            List<Integer> newOp = new ArrayList<>(op);
            newOp.add(ip.get(i));

            List<Integer> newIp = new ArrayList<>(ip);
            newIp.remove(i);

            DFS(newIp, newOp);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> ip = new ArrayList<>();
        for (int num : nums) {
            ip.add(num);
        }

        DFS(ip, new ArrayList<>());
        return res;
    }
}