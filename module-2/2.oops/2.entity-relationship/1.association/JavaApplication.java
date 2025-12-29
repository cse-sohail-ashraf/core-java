class JavaApplication{
	public static void execution(){
		MediaPlayer mediaPlayer = new MediaPlayer("Sony",20000.00,"India");
		Engine engine = new Engine(1200.00,4,5000);
		Car car = new Car("Hyndai",1500000.00,"India","Red",engine);
		car.displayCarInfo();
		car.getEngine().displayEngineInfo();

		//Dependency Injection - Setter Method
		car.setMediaPlayer(mediaPlayer);
		car.getMediaPlayer().displayMediaPlayerInfo();
	}
}