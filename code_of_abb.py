string = input()
arr = string.split(" ")
abrv = ""
new_abrv = ""
arr_new = []

#string is abbrevated
for word in arr:
  abrv += word[0]

print(abrv)

for ele in abrv:
  arr_new.append(ele)
  
#checking for consicutive letters
for x in range(0,len(arr_new)-1):
  if arr_new[x] == arr_new[x+1]:
    arr_new.pop(x+1) 
    new_abrv += arr_new[x]
  else:
    new_abrv += arr_new[x]

print(new_abrv)