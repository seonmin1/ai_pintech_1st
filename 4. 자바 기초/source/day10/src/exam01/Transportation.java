package exam01;

public enum Transportation {
    SUBWAY("지하철") {
        @Override
        public int getTotal(int person) {
            return 1500 * person;
        }
    },
    BUS("버스") {
        @Override
        public int getTotal(int person) {
            return 1400 * person;
        }
    },
    TAXI("택시") {
        @Override
        public int getTotal(int person) {
            return 4500 * person;
        }
    };

    private final String title; // 상수의 정의이므로 final 붙이기

    Transportation(String title) { // private
        this.title = title; // 멤버 변수 초기화
    }

    public String getTitle() {
        return title;
    }

    public abstract int getTotal(int person); // 추상 메서드 정의
}
