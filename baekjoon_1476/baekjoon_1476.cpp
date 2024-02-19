#include<iostream>

using namespace std;

int main() {
  int result = 1;
  int targetE, targetS, targetM;
  scanf("%d %d %d", &targetE, &targetS, &targetM);

  int earth = 1, sun = 1, moon = 1;
  while(true) {
    if(earth == targetE && sun == targetS && moon == targetM) break;

    if(earth++ == 15) earth = 1;
    if(sun++ == 28) sun = 1;
    if(moon++ == 19) moon = 1;
    result++;
  }

  printf("%d", result);
}