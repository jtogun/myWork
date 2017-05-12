"""
Python Assignment 1.py
"""

def ex1() :
    """
    exercise 1
    """
    import math 
    print("Exercise 1")

    height = float(input("Please enter the height of the triangle: "))
    if height <= 0:
        print("sorry but the number cannot be a negative number")
        height = float(input("Please enter the height of the triangle: "))
        
    length = float(input("Please enter the length of the hypotenuse of the triangle: "))
    if length <= 0:
        print("sorry but the number cannot be a negative number")
        length = float(input("Please enter the length of the hypotenuse of the triangle: "))
    if height >= length :
        print("Sorry but the length has to be bigger than the height")
        return
    

    widthSqr = length**2 - height**2
    width = math.sqrt(widthSqr)
    print("The width of the triangle is:",round(width, 2))

    angle1 = math.asin(height / length)
    angle1 = math.degrees(angle1)
    print("The first angle is:", round(angle1,2),"degrees.", "\nThe second angle is:",round(90 - angle1,2),"degrees.","\nThe third angle is: 90.00 degrees.")
    
def ex2() :
    """
    exercise 2
    """
    print("Exercise 2")
    fibLen = int(input("Enter a positive number for the fibonacci series: "))
    if fibLen <= 0 :
        print("Sorry but please enter a positive number: ")
        return
    elif fibLen==1:
        print(1)
        return
    elif fibLen==2:
        print("1,1")
        return
    else:
        fibs=[1,1]
        i=2
    while i<fibLen:
     nextnum=fibs[-2]+fibs[-1]
     fibs.append(nextnum)
     i=i+1
    outstring="1,1"
    for n in fibs[2:]:
     outstring=outstring+","+str(n)
    print(outstring)
       
def ex3() :
    """
    exercise 3
    """
    print("Exercise 3")
    import math 
    n = int(input("Please enter the positive number you wish to check is a prime number: "))
    i = 3
    nSqrt = math.sqrt(n)
    if n <= 0:
        print("Sorry but that is not a positive number")
        return
    elif n == 2:
        print("The number is prime")
        return
    elif n==3:
        print("The number is prime")
        return
    elif n ==1:
        print("The number is not prime")
        return
    if n %2 > 0:
        if i<nSqrt:
            if n%i>0:
                i = i +2
            print("the number is not prime")
        else: print("The number is prime")
        return
def ex4() :
    """.
    exercise 4
    """
    print("Exercise 4")
    r = int(input("How many rows do you want?: "))
    while r <=0:
        r =int(input("Sorry but please enter a positive amount of rows: "))
    c = int(input("How many columns do you want?: "))
    while c<=0:
        c=int(input("Sorry but please enter a positive amount of columns: "))
    
    i = 1
    x = 1
    l = len(str(r**c))+2
    while i <=r:
        myString = ""
        j = 1
        y = 1
        while j <= c:
            myString = myString+format(x**y, str(l)+"d")
            j = j +1
            y = y+1
        print(myString)
        x = x+1
        i = i+1
    return
        

    
def ex5() :
    """
    exercise 5
    """
    print("Exercise 5")
    fullText = input("Plese input a sentence you would like to split: ")
    text = fullText.split()
    for text in text:
        print(text)
    
def ex6() :
    """
    exercise 6
    """
    print("Exercise 6")
    text= input("Please enter a sentence: ")
    a = text.count("a")
    A = text.count("A")
    a = a+A
    e = text.count("e")
    E = text.count("E")
    e = e +E
    i = text.count("i")
    I = text.count("I")
    i = i +I
    o =text.count("o")
    O = text.count("O")
    o = o +O
    u =text.count("u")
    U = text.count("U")
    u = u+U
    m= (max(a,e,i,o,u))
    
    if m ==0:
        print("Sorry but there are no vowels in the sentence")
        return 0
    if a == m:
        print("a occures", m,"times") 
    if e == m:
        print("e occures", m,"times")
    if i == m:
        print("i occures", m,"times")
    if o == m:
        print("o occures", m,"times")
    if u == m:
        print("u occures", m,"times")

        
def ex7() :
    """
    exercise 7
    """
    print("Exercise 7 not attempted")
    
def ex8() :
    """
    exercise 8
    """
    print("Exercise 8 not attempted")


# modify the following line so that your name is displayed instead of Lisa's
print("CE151 assignment 1 - Jordan Tosin Ogungbo")

# do not modify anything beneath this line
exlist = [None, ex1, ex2, ex3, ex4, ex5, ex6, ex7, ex8]
running = True
while running :
    line = input("Select exercise (0 to quit): ")
    if line == "0" : running = False
    elif len(line)==1 and "1"<=line<="8": exlist[int(line)]()
    else : print("Invalid input - try again")


