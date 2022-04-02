def main():
    nums = list(map(int, input().split()))

    product = 1
    for i in nums:
        product *= i

    print(product)


if __name__ == "__main__":
    main()
