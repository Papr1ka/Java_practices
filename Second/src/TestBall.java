public class TestBall {
    public void test()
    {
        System.out.format("%-10s %-15s %10s\n", "-----", "TestBall", "-----");

        Ball ball = new Ball();
        assert ball.getX() == 0 && ball.getY() == 0;

        Ball ball2 = new Ball(1, 2);
        assert ball.getX() == 1 && ball.getY() == 2;

        ball2.move(5, 4);
        System.out.println(ball2.toString());
        System.out.println("С мячиком всё хорошо");

        System.out.format("%-10s %-15s %10s\n", "-----", "End TestBall", "-----");
    }
}
