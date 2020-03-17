s = 'python'
s = s[2:5:-1]
#print(s)

numbers = [0, 1, 2, 'three', 4, 5, 6, 7, 8, 9]

print('numbers[0:4]' + str(numbers[0:4]))
print('numbers[:4]' + str(numbers[:4]))
print('numbers[4:]' + str(numbers[4:]))
print('numbers[2:-2]' + str(numbers[2:-2]))
print('numbers[0:9:2]' + str(numbers[0:9:2]))
print('numbers[::2]' + str(numbers[::2]))
print('numbers[::-1]' + str(numbers[::-1]))

#assign, same ID, same element references
numbers2 = numbers
numbers2.append(10)
print(numbers)
print(numbers2)

import copy
#shallow copy, different ID, but same element references
list1 = [0, [1,1], 2]
list2 = list1[:]
list3 = copy.copy(list1)
list2[1].append(1)
list2.append(3)
list1[0] = 10
print(list1)
print(list2)
print(list3)

#deep copy, different ID, different element references
list1 = [0, [1,1], 2]
list2 = copy.deepcopy(list1)
list2[1].append(1)
list2.append(3)
print(list1)
print(list2)

list1 = [0, 1, 2, 3]
L1 = [2*i + 1 for i in list1]
print(L1)
list2 = ['apple', 'orange', 'pear']
L2 = [word[0].upper() for word in list2]
print(L2)

list1 = list('hello')
print(list1)

a = "spam"
b = "eggs"
a, b = b, a
print(a, b)