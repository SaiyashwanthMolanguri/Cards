class compareHands {
   int compareTo(Hand that) {
      for(int i = 0; i < 6; i++) {
          if(this.value[i]  > that.value[x])
             return 1;
          else if(this.value[i] != that.value[i])
             return -1;
     } return 0;
  }
}

