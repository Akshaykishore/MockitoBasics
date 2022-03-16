package impl;

import service.MathService;

public class MathServiceImpl implements MathService {

    @Override
    public long doubleLong(long num) {
        return 2 * num;
    }

    @Override
    public long tripleLong(long num) {
        return 3 * num;
    }

    @Override
    public long addition(long... nums) {
        int sum = 0;
        for (long a : nums) sum += a;
        return sum;
    }
}
