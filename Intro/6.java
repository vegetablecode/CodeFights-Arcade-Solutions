int makeArrayConsecutive2(int[] statues) {
   int maximum = statues[0];
   int minimum = statues[0];
   for(int i=0; i<statues.length; i++){
      if(statues[i]>maximum) maximum = statues[i];
      if(statues[i]<minimum) minimum = statues[i];
   }
   return (maximum-minimum+1)-statues.length;
}

