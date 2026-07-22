import java.util.*;
public class Subsets{
    public static void findSubsets(int index,int[] nums,List<Integer>list,List<List<Integer>>answer){
        if(index==nums.length){
            answer.add(new ArrayList<>(list));
            return;
        }
        list.add(nums[index]);
        findSubsets(index+1,nums,list,answer);
        list.remove(list.size()-1);
        findSubsets(index+1,nums,list,answer);
    } 
    public static void main(String[] args){
        int nums[]={1,2,3};
        List<List<Integer>>answer=new ArrayList<>();
        findSubsets(0,nums,new ArrayList<>(),answer);
        System.out.println(answer);
    }
} 