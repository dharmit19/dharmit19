#include "lib_area_shapes.h"
#include<stdio.h>

int main(void){
    int l = 3, b = 4;
    int r = 10;
    int x = 5;

    printf("Area of rectangle with dimension(%d, %d) = %d\n", l, b, area_rect(l, b));
    printf("Area of circle with r=%d is: %.3f\n", r, area_circle(r));
    printf("Area of square with s=%d is: %d\n", x, area_square(x));
    
    return 0;
}

#include <stdio.h>
#include "lib_conversions.h"
 
int main(){
    float feet3 = 1;
    printf("cubic feet: %f\n", feet3);
    printf("litres    : %f\n", feet3_to_litre(feet3));

    float celsius = 0;
    printf("celsius : %f\n", celsius);
    printf("fahrenheit: %f\n", celsius_to_fahrenheit(celsius));

    float metre = 1;
    printf("metre : %f\n", metre);
    printf("feet  : %f\n", metre_to_feet(metre));

}

#include "functions.h"
#include<stdio.h>
int main(){
    int n = 5;
    sum(n); // `sum_n` contains the result
    printf("Sum till n for %d: %d\n", n, sum_n);

    int f = 6;
    factorial(f); // `fact_n` contains result
    printf("factorial(%d) = %d\n", f, fact_n);

    int num = 36;
    printf("Factors of %d are :\n", num);
    factors(num); // this will print the factors
}


