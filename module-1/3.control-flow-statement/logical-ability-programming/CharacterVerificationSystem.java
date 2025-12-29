class CharacterVerificationSystem{
	public static void main(String[] args) {
		char c = 'e';
		if(c > '0' && c <='9') {
			System.out.println("digit");
		}
		else if(c > 'a' && c < 'z') {
			if ((c == 'a')||(c == 'e')||(c == 'i')||(c == 'o')||(c == 'u')){
				System.out.println("LowerCase Vowel");
			}else{
				System.out.println("LowerCase consonant");
			}
		}
		else if(c > 'A' && c < 'Z'){
			if ((c == 'A')||(c == 'E')||(c == 'I')||(c == 'O')||(c == 'U')){
				System.out.println("UpperCase Vowel");
			}else{
				System.out.println("UpperCase consonant");
			}
		}else{
			System.out.println("Special Character");
		}
	}
}