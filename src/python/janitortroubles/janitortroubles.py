import math


def main():
    nums = list(map(int, input().split()))
    semiperimeter = (sum(nums)) / 2

    print(math.sqrt((semiperimeter - nums[0]) *
                    (semiperimeter - nums[1]) *
                    (semiperimeter - nums[2]) *
                    (semiperimeter - nums[3])))


if __name__ == "__main__":
    main()
