  import java.util.*;
 class Solution {
     class Node {
         int sum;
         int idx;
         Node(int sum,int idx) {
             this.sum=sum;
             this.idx=idx;
	         }
         public String toString() {
             return sum+","+idx;
         }
     }
     public long solution(int[] classes, int k) {
         long answer = 0;
         Queue<Node> pq = new PriorityQueue<>((n1,n2)->n1.sum-n2.sum);
         for(int i=0;i<k;i++)
             pq.offer(new Node(0,i));
         for(int i=0;i<classes.length;i++) {
             Node node = pq.poll();
             node.sum+=classes[i];
             pq.offer(node);
             System.out.println(pq);
         }
         for(int i=0;i<k;i++)
             answer=Math.max(answer,pq.poll().sum);
	     
	   try
        {
            Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt = conn.preparedStatement("some query"); // executes a valid query
	            ResultSet rs = stmt.executeQuery();
            while(rs.hasNext())
            {
               System.out.Println("rs")''
            }
        }
        catch(SQLException sqlEx)
        {
            System.out.Println(sqlEx.ToString()'
        }
 
         return answer;
     }
 }
 
  
