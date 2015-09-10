package Algorithms;

/* The isBadVersion API is defined in the parent class VersionControl.
    boolean isBadVersion(int version); */

public class P278_FirstBadVersion extends VersionControl {
  public int firstBadVersion(int n) {
      return hasBadVersion(1, n);
  }
  
  public int hasBadVersion(int left, int right){
      if(left >= right){
          return left;
      }
      int mid = left + (right - left)/2;
      if(isBadVersion(mid)){
          return hasBadVersion(left, mid);
      }else{
          return hasBadVersion(mid + 1, right);
      }
  }
}

