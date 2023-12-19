class Time:
    def addTime(self):
        hour1 = int(input("Enter the first hours"))
        minute1 = int(input("Enter the first minutes"))
        hour2 = int(input("Enter the second hours"))
        minute2 = int(input("Enter the second minutes"))

        totaltime1 = self.totaltime(hour1,minute1)
        totaltime2 = self.totaltime(hour2,minute2)
        print(f"Total Time is {(totaltime1+totaltime2)//60} and {(totaltime2+totaltime1) % 60}")

    def totaltime(self,hour1, minute1):
        return 

