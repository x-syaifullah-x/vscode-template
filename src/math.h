#ifndef MATH_H
#define MATH_H

unsigned int power(int x, unsigned int y) {
    if (y == 0) {
        return 1;
    } else if (y % 2 == 0) {
        return power(x, y / 2) * power(x, y / 2);
    } else {
        return x * power(x, y / 2) * power(x, y / 2);
    }
}

float power_f(float x, int y) {
    float temp;
    if (y == 0) {
        return 1;
    }

    temp = power_f(x, y / 2);
    if (y % 2 == 0) {
        return temp * temp;
    } else {
        if (y > 0)
            return x * temp * temp;
        else
            return (temp * temp) / x;
    }
}

#endif