import java.util.Scanner;
void display_board(char board[3][3]) {
    printf("\n");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            printf(" %c ", board[i][j]);
            if (j < 2) {
                printf("|");
            }
        }
        printf("\n");
        if (i < 2) {
            printf("---|---|---\n");
        }
    }
    printf("\n");
}


int check_win(char board[3][3], char player) {
    for (int i = 0; i < 3; i++) {
        if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
            return 1;
        }
    }

    for (int i = 0; i < 3; i++) {
        if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
            return 1;
        }
    }

    if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
        return 1;
    }

    if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
        return 1;
    }

    return 0;
}

int main() {
    char board[3][3];
    char player1 = 'X';
    char player2 = 'O';
    int row, col;
    int move_count = 0;
    int current_player = 1;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            board[i][j] = ' ';
        }
    }

    printf("Tic-Tac-Toe Game\n");
    printf("Player 1: X\nPlayer 2: O\n");

    while (move_count < 9) {
        display_board(board);

        if (current_player == 1) {
            printf("Player 1 (X) - Enter row (0-2) and column (0-2) separated by space: ");
        } else {
            printf("Player 2 (O) - Enter row (0-2) and column (0-2) separated by space: ");
        }

        scanf("%d %d", &row, &col);

    
        if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != ' ') {
          print("Invalid move. Try again.\n");
            continue;
        }

        if (current_player == 1) {
            board[row][col] = 'X';
        } else {
            board[row][col] = 'O';
        }

        
        if (check_win(board, current_player == 1 ? 'X' : 'O')) {
            display_board(board);
            print("Player %d wins!\n", current_player);
            return 0;
        }

        
        current_player = (current_player == 1) ? 2 : 1;
        move_count++;
    }

    display_board(board);
    print("It's a draw!\n");

    return 0;
}