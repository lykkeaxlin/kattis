import sys


def main():
    strength = 1

    for line in sys.stdin:
        cards = line.split()
        rankes = [cards[i][0] for i in range(5)]

        for rank in rankes:
            if rankes.count(rank) > strength:
                strength = rankes.count(rank)

    print(strength)


main()
