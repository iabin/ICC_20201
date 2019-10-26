public class Board{
    private int[][] matrix;
    private ProcessingAdapter adapter = ProcessingAdapter.getInstance();
    private int pixel_size;

    public Board(int pixel_size){
        this.matrix = new int[8][8];
        this.pixel_size = pixel_size;
    }

    public void draw(){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(j%2==0){
                    if(i%2==0) adapter.fill(255, 255, 255);
                    else adapter.fill(10,108,3);
                }else{
                     if(i%2==0) adapter.fill(10,108,3);
                    else adapter.fill(255,255,255);
                }
                adapter.rect(i*this.pixel_size, j*this.pixel_size, this.pixel_size, this.pixel_size);
            }
        }
    }
}