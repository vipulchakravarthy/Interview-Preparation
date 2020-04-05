# your task is to complete this function
# function should return an integer
def atoi(string):
    # Code here
    if(any(c.isalpha() for c in string)):
        return int("-1")
        
    return int(string)

