package text.text_mondai14;

public class CDPlayer implements Player {
    
    @Override public void play(){
        System.out.println("**CDの再生開始!");
    }

    @Override public void stop(){
        System.out.println("**CD再製終了!");
    }

    public void cleaning(){
        System.out.println("**ヘッドをクリーニングしました");
    }
}
