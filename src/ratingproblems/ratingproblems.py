def main():
    n, k = map(int, input().split())
    sum = 0

    for _ in range(k):
        sum += int(input())

    min = sum + (-3*(n-k))
    max = sum + (3*(n-k))
    print(min/n, max/n)


if __name__ == "__main__":
    main()
