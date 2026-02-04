#include<stdio.h>
#include<sys/stat.h>
#include<fcntl.h>
int main(){
	int bt[10],wt[10],tat[10];
		
		int i,j,temp,n;
		printf("enter the process :");
		scanf("%d",&n);
	  printf("enter the burst time:");
	  
		for(int i=0;i<n;i++){
			scanf("%d",&bt[i]);
			
			}
				for(i=0;i<n-1;i++){
					for(int j=i+1;j<n ;j++){
						if(bt[i]>bt[j]){
							temp = bt[i];
							bt[i]=bt[j];bt[j]=temp;
							
						}
					}
				}
				wt[0] =0;
				for(int i=1;i<n;i++){
						wt[i] = wt[i-1]+bt[i-1];
						
				}
				for(int i=0;i<n;i++){
					tat[i] = wt[i]+bt[i];
				}
					printf("\nProcess\tBurst Time\tWaiting Time\tTurnaround Time\n");
    for(i = 0; i < n; i++) {
        printf("%d\t%d\t\t%d\t\t%d\n", i+1,bt[i],wt[i],tat[i]);
		
}
}
