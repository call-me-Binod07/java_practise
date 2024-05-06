//BinarySearch.java


class BinarySearch{
public static void main(String args[]){

System.out.println(binarySearch(new int[] {1,2,3,4,7,12,13,17,99,1000,1002} ,7 ) );
//binarySearch(new int[] {1,2,3,4,7,12,13,17,99,1000,1002} ,7 );


}

private static int binarySearch(int arr[], int x){
 int l = 0;
int r = arr.length-1;

while(l<=r){
int mid = (l+r)/2 ;
if (arr[mid] == x){
return mid;
}else if(x> arr[mid]){
l=mid+1;
}else{
r=mid-1;
}




}
return -1;
}

}
















