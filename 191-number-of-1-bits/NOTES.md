count+=n&1 -> this is bitwise and, if the last digit in binary form is 1, then 1&1=1, so count will increase by 1, if it is 0, 0&1=0 so count will remain the same.
n=n>>>1 -> logical right shift of n, i.e least significant digit(last digit) will be discarded and 0 will be inserted as the most significant digit(first digit, I've used logical right shift instead of arithmetic right shift because we are treating the number as unsigned, so the most significant bit is not treated as sign bit)
​
In this way, we are counting the number the number of 1's until all the digits in the original number become 0.