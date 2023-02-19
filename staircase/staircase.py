def staircase(n):
    ar = range(n)
    
    for number in ar:
        index_plus_one = ar.index(number) + 1
        spaces_count = n - index_plus_one
        print(spaces_count * ' ' + index_plus_one * '#')
    