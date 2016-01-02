/*
Zach Panzarino and Jeremy Switlyk
12/11/15
Program 7.10 - tests the tic tac toe game
*/

import java.util.Scanner;
public class TicTacToeTester{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        String winner = " ";
        String team;
        int row, col;
        System.out.println(game.toString());
        while(winner.equals(" ")){
            System.out.print("Enter your team (x or o): ");
            team = scan.next();
            System.out.print("Enter the row for your move: ");
            row = scan.nextInt();
            System.out.print("Enter the column for your move: ");
            col = scan.nextInt();
            game.set(row, col, team);
            System.out.println(game.toString());
            winner = game.getWinner();
        }
        System.out.println("The winner is "+winner);
    }
}
/* Program Output
|   |
|   |
|   |

Enter your team (x or o): o
Enter the row for your move: 0
Enter the column for your move: 0
|o  |
|   |
|   |

Enter your team (x or o): o
Enter the row for your move: 0
Enter the column for your move: 1
|oo |
|   |
|   |

Enter your team (x or o): o
Enter the row for your move: 0
Enter the column for your move: 2
|ooo|
|   |
|   |

The winner is o

|   |
|   |
|   |

Enter your team (x or o): o
Enter the row for your move: 1
Enter the column for your move: 0
|   |
|o  |
|   |

Enter your team (x or o): o
Enter the row for your move: 1
Enter the column for your move: 1
|   |
|oo |
|   |

Enter your team (x or o): o
Enter the row for your move: 1
Enter the column for your move: 2
|   |
|ooo|
|   |

The winner is o

|   |
|   |
|   |

Enter your team (x or o): x
Enter the row for your move: 0
Enter the column for your move: 0
|x  |
|   |
|   |

Enter your team (x or o): x
Enter the row for your move: 1
Enter the column for your move: 0
|x  |
|x  |
|   |

Enter your team (x or o): x
Enter the row for your move: 2
Enter the column for your move: 0
|x  |
|x  |
|x  |

The winner is x

|   |
|   |
|   |

Enter your team (x or o): x
Enter the row for your move: 1
Enter the column for your move: 1
|   |
| x |
|   |

Enter your team (x or o): o
Enter the row for your move: 0
Enter the column for your move: 0
|o  |
| x |
|   |

Enter your team (x or o): x
Enter the row for your move: 0 
Enter the column for your move: 2
|o x|
| x |
|   |

Enter your team (x or o): o
Enter the row for your move: 2
Enter the column for your move: 1
|o x|
| x |
| o |

Enter your team (x or o): x
Enter the row for your move: 2
Enter the column for your move: 0
|o x|
| x |
|xo |

The winner is x

|   |
|   |
|   |

Enter your team (x or o): x
Enter the row for your move: 0
Enter the column for your move: 1
| x |
|   |
|   |

Enter your team (x or o): x
Enter the row for your move: 1
Enter the column for your move: 1
| x |
| x |
|   |

Enter your team (x or o): x
Enter the row for your move: 2
Enter the column for your move: 1
| x |
| x |
| x |

The winner is x

|   |
|   |
|   |

Enter your team (x or o): o
Enter the row for your move: 0
Enter the column for your move: 0
|o  |
|   |
|   |

Enter your team (x or o): x
Enter the row for your move: 0
Enter the column for your move: 2
|o x|
|   |
|   |

Enter your team (x or o): o
Enter the row for your move: 2
Enter the column for your move: 2
|o x|
|   |
|  o|

Enter your team (x or o): x
Enter the row for your move: 2
Enter the column for your move: 0
|o x|
|   |
|x o|

Enter your team (x or o): o
Enter the row for your move: 1
Enter the column for your move: 1
|o x|
| o |
|x o|

The winner is o
*/