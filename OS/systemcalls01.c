#include<stdio.h>
#include<sys/stat.h>
#include<fcntl.h>
#include<sys/types.h>
#include<dirent.h>

int main() {
    char d[100];
    int c, op;
    DIR *e;
    struct dirent *sd;

    printf("** MENU **\n 1. Create dir\n 2. Remove dir\n 3. Read dir\n Enter your choice: ");
    scanf("%d", &op);

    switch(op) {

        case 1:
            printf("Enter the dir name: ");
            scanf("%s", d);

            c = mkdir(d, 0777);
            if(c == -1)
                printf("Directory is not created\n");
            else
                printf("Directory is created\n");
            break;

        case 2:
            printf("Enter dir name: ");
            scanf("%s", d);

            c = rmdir(d);
            if(c == -1)
                printf("Directory is not removed\n");
            else
                printf("Directory is removed\n");
            break;

        case 3:
            printf("Enter the dir name to open: ");
            scanf("%s", d);

            e = opendir(d);
            if(e == NULL) {
                printf("Directory does not exist\n");
            } else {
                printf("Directory exists\n");
                while((sd = readdir(e)) != NULL) {
                    printf("%s\t", sd->d_name);
                }
                closedir(e);
            }
            break;

        default:
            printf("Invalid choice\n");
    }

    return 0;
}


