# Реализовать перемножение двух матриц в многопоточном режиме. 
Нужно написать класс, который бы мог осуществлять такое перемножение. На вход ему подаются две матрицы. На выходе - результат перемножения. 
Особое внимание тут нужно обратить на то, какую именно часть работы вы будете выполнять в каждом потоке и, 
что если будете создавать тысячи потоков, каждый из которых будет считать только одну ячейку, то это крайне не эффективно.
