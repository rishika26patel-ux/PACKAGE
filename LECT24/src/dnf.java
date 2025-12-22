public class dnf {
    public static void main(String[]args){
        int arr[]={1,2,1,0,0,2,1};
        int low=0;
        int mid=0;
        int h=arr.length-1;
        while(mid<=h)
        {
            if(arr[mid]==0)
            {
                //swap(arr,low,mid);
                low++;
                mid++;
            }
            if(arr[mid]==1){
                mid++;
            }
            if(arr[mid]==2)
            {
                //swap(arr,mid,h);
                mid--;
            }
        }
    }
}
