#
#program showing indentation in python
#this meant for teaching purpose only
#https://daveads.github.io/2020/01/17/indentation-in-python.html
#
user_name = input("Name:: ")
user_input = input("input a valid password\n")

if (user_input == "evad"): #single tab 
    print("logged in") 
    print("welcome back "+ user_name)
else:
    print("incorrect passworld")
    print(user_input)


