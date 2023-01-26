public class ArrayMax {
  
  public static void main(String[] args){

    int[] arr = { 1,3,4,634,6434,444,3342};

    int ans = max(arr,0,arr.length-1);
    System.out.println(ans);
  }



  //working on edge cases here, like array being null

  static int max(int[] arr, int stat, int end){

    if(end> stat){
    return -1;
    }
    
    if(arr == null){
      return -1;
    }

    int maxVal = arr[stat];
    for(int i =stat; i<=end;i++){
      if(arr[i]>maxVal){
        maxVal = arr[i];
      }
     }
      return maxVal;
      
   
  }
}
/*
 output
 6434
 */