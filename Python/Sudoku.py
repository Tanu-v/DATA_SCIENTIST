#s1

# Read 9 lines of input and build the board
board = []
valid = True

print("Enter 9 lines of Sudoku (each with exactly 9 digits from 1 to 9):")
for _ in range(9):
    row = input()
    # Check if the row is valid
    if len(row) != 9 or not row.isdigit() or '0' in row:
        valid = False
        break
    board.append([int(ch) for ch in row])

if not valid or len(board) != 9:
    print("No")
else:
    correct_set = set(range(1, 10))

    # Check rows
    for row in board:
        if set(row) != correct_set:
            valid = False
            break

    # Check columns
    if valid:
        for col in range(9):
            column = [board[row][col] for row in range(9)]
            if set(column) != correct_set:
                valid = False
                break

    # Check 3x3 sub-squares
    if valid:
        for box_row in range(0, 9, 3):
            for box_col in range(0, 9, 3):
                square = []
                for i in range(3):
                    for j in range(3):
                        square.append(board[box_row + i][box_col + j])
                if set(square) != correct_set:
                    valid = False
                    break

    print("Yes" if valid else "No")
    
    
#s2

# Check if all rows are good.
for r in range(9):
    if not checkset(rows[r]):
        ok = False
        break

# Check if all columns are good.	
if ok:
    for c in range(9):
        col = []
        for r in range(9):
            col.append(rows[r][c])
        if not checkset(col):
            ok = False
            break

# Check if all sub-squares (3x3) are good.
if ok:
    for r in range(0, 9, 3):
        for c in range(0, 9, 3):
            sqr = ''
            # Make a string containing all digits from a sub-square.
            for i in range(3):
                sqr += rows[r+i][c:c+3]
            if not checkset(list(sqr)):
                ok = False
                break

# Print the final verdict.
if ok:
    print("Yes")
else:
    print("No")
    