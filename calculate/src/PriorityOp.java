import java.util.PriorityQueue;

public class PriorityOp {

    /**
     * PriorityQueue：是基于二叉堆原理的优先队列，队列用动态数组实现
     * PriorityBlockingQueue：是PriorityQueue线程安全版本
     * DelayQueue：基于PriorityQueue实现的延迟队列
     * DelayedWorkQueue：原理与DelayQueue相同
     * @param k
     * @param nums
     */
    public static void getKMax(int k,int[] nums){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0;i<nums.length;i++){
            if (priorityQueue.size()<k){
                priorityQueue.add(nums[i]);
            }else if(nums[i]>priorityQueue.peek()){
                priorityQueue.poll();
                priorityQueue.add(nums[i]);
            }
            if (priorityQueue.size()==k){
                System.out.println(priorityQueue.peek());
            }
        }
    };
}
