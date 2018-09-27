Names: David, Laly, Abe <br/>
Lab 4

See main.java for optimal and nonoptimal examples.

 - Test 1:
 
 - Input : 12, 4, 8, 15, 9, 3, 1, 10
 - Bin space : 20
 - Number of bins that can be used: 3
   - Our result - Bin 1 : [12,4, 3,1]
                - Bin 2 : [8, 9]
                - Bin 3 : [15]
                - Remainder : [10]
                 
                 
- Test 2:

- Input :  89, 12, 25, 66, 92, 30
- Bin space : 100
- Number of bins that can be used: 3
  - Our result - Bin 1 : [89]
               - Bin 2 : [12, 25, 30]
               -  Bin 3 : [66]
               -  Remainder : [92]
                   
                   
- Test 3:  
            - Input :  2, 3, 4, 5, 1 ,2
            - Bin space : 5
            - Number of bins that can be used: 3
              - Our result - Bin 1 : [2, 3]
                           - Bin 2 : [4, 1]
                           - Bin 3 : [5]
                           - Remainder : [2]     
       
                
 -   Explanation of our algorithm:  
     Our algorithm takes in a capacity; the number of elements, and the size of each element.
     It puts the first element in the array into the first bin if that element is below the capacity otherwise it will 
     be added to the remainder. This will continue through the array of elements until each bin is at or as near 
     capacity as possible. Our algorithm only makes one pass over the array of elements. This means the big O is n. The
     worst case would be big theta of n since every element is gone over once.