## 🧠 Matrix Neighbor Position - Java

A simple Java project developed to practice 2D arrays and matrix traversal.

## 🚀 Features
Read a matrix (M x N)  
Find all occurrences of a given number  
Display adjacent elements (left, up, right, down) when available  

## 🛠️ Technologies Used
Java (JDK 17+)  
IntelliJ IDEA  
Git & GitHub  
Scanner (for user input)  

## 📚 Concepts Applied

🔹 Matrices (2D Arrays)  
Used a two-dimensional array (int[][]) to store matrix values.

🔹 Loops (for)  
Nested loops were used to traverse rows and columns.

🔹 Conditionals (if)  
Conditional statements were used to find the target value and validate boundaries.

🔹 Boundary Checking  
Ensures safe access to matrix positions (avoiding index out of bounds).

## 💡 How the Concepts Were Applied
The matrix is filled with user input  
Nested loops iterate through all positions  
The program checks for occurrences of a target value  
For each occurrence, adjacent elements are displayed with proper boundary validation  

## ▶️ How to Run
Compile the project  
Run the Main class  
Enter matrix dimensions (M and N)  
Input matrix values  
Enter the target number  

## 💡 Extra tip

## 📌 Example Input
```
3 3
1 2 3
4 5 6
7 8 5
5
```

## 📌 Output
```
Position: 1, 1
Left: 4
Up: 2
Right: 6
Down: 8

Position: 2, 2
Left: 8
Up: 6
```
