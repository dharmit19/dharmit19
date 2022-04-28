#define pi 3.14
#define area_square(x) x*x
#define area_rect(x, y) x*y
#define area_circle(r) pi*r*r

#define metre_to_feet(m) (m*3.28)
#define litre_to_feet3(l) (l / 28.316)
#define celsius_to_fahrenheit(c) ((c*9/5) +32)
#define feet_to_metre(f) (f/3.28)
#define feet3_to_litre(f) (f * 28.316)
#define fahrenheit_to_celsius(f) ((f-32)*5/9)


#define sum(n) \
int sum_n = 0; \
for(int i=1; i<=n; i++){\
    sum_n += i;          \
}


#define factorial(n)\
int fact_n = 1; \
for(int i=1; i<=n;i++){ \
    fact_n *= i;        \
}


#define factors(n)\
for(int i=1;i<=n;i++){\
    if(n%i==0)\
        printf("%d, ", i);\
}

