#include <iostream>
using namespace std;

void bs( int arr[],int n,int x)
{
    int l=0;
    int r=n-1;
    while(l<=r){
        int mid=(l+r)/2;
        if(arr[mid]==x){
            cout<<"found"<<endl;
            cout<<"The index of X is"<<mid<<endl;
            return;
        }
        else if
            (arr[mid]>x)r=mid-1;
        
            
        else l=mid+1;
    }
    cout<<"X not found"<<endl;
}


int main() {
    int n;
    cin >>n;
    int ar[n+3];
    for(int i=0;i<n;i++)cin>>ar[i];
    int x;
    cin>>x;
    bs(ar,n,x);
    
}
