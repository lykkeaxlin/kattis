def main():

    n = int(input())
    length = 0

    for _ in range(n):
        length += int(input())

    print(length - (n-1))


if __name__ == "__main__":
    main()
