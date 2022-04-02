def main():

    line = list(input())

    if len(line) % 2 != 0:
        print('fix')
    else:
        print('correct' if line.index('(') == (len(line)-2)//2 else 'fix')


if __name__ == "__main__":
    main()
