public class Index_in_mountain_array {
    public static void main(String[]args){
        int arr[]={2,0,4,6,9};
        int left=0;
        int high=arr.length-1;
        while(low<high){
            int mid(low<high)/2;
            if(arr[mid]<<arr[mid+1]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return low;
    }
};
    }
}
