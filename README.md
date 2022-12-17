Welcome to another edition of Ana's learning!
I was recently sent an invitation to complete Google's Foobar challenge.
The challenge takes place in Bunny HQ, where each job or tasks has a specified number. In order to avoid any potential bunny revolutions, we have to carefully look at the list of tasks given to each bunny to avoid scheduling the bunny for an specific tasks too often, which is where my program comes in handy. 
My solution requires for the user to enter an array of numbers, or more specifically, a list of the tasks that will be given to each bunny. In addition, the user will have to provide the threshold for which occurrences to delete.  
Ex: 
Pink bunny starts complaining after doing the same job 4 times, therefore, if we have a tasks that has been schedueled more than 4 times, we should delete it and reconsider the schedule. 

My solution utilizes Quick Sort in order to facilitate the counting of tasks. 

Sample input: 
Please enter your numbers here: **2 5 6 2 6 2 3 18 4 2 5 6 2 2 quit**

Type the number of occurrences you wish to remove (x): **3**

Array after removing 3 occurrences: 3, 4, 5, 5, 6, 6, 6, 18
Do you want to go again? Y or N: **N**
              Goodbye!
