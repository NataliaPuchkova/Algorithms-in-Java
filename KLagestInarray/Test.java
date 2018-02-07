class Test{
        public int getKLagest(int[] a, int k){
                Arrays.sort(a);
                return a[a.length-k];
        }

        public int getKLagest2(int[] a, int k){
                PriorityQueue<Integer> queu = new PriorityQueue<Integer>();
                for (int item:a){
                        queu.offer(item);
                        if (queu.size()>k) queu.poll();
                }
                if(queue.size()==3) return queue.peek();
        }
}
