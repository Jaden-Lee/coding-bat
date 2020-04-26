def parrot_trouble(talking, hour):
  return talking & (hour < 7 or hour > 20)