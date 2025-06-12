# robot
# finch-robot

### Development Checklist

| Completed | Task         | Description |
|:---------:| :-----------:|:------------|
|    ✅     | Familiarize  | Learn how to: <ul><li>Connect to the robot</li><li>Interpret what built-in sensors detect</li><li>Program basics in SNAP!</li><li>Setup local developing environment to code in Java</li></ul>|
|    ✅     | 3D Design    | Created my version vortex cannon.|
|    ✅     | Develop Code | Combined multiple Finch robot features like LED display, compass, motion, and shake detection into one interactive program.|

---

<details>
<summary><strong>Inspiration for the Project</strong></summary>

Wanted to test around with the LED, compass, and shake.
</details>

---

### Design Cycle
<img src="design_cycle.png" alt="design cycle" width="300" height="300">

###### My experience with the Engineering Design Cycle: 
**ASK** => Wanted to make something using the shake feature.
**RESEARCH** => searched how the shake feature works, and also learnt about the compass.
**IMAGINE** => I imagined that if the robot shook, it would stop all motions.
**PLAN** => Planned to incorporate LEDs + Compass + Motion + Shake Detection.
**CREATE** => Created small codes for each. For example: A code that tested the shaking sensor, the compass, LEDs, and also motion like forwards.
**TEST** => A lot of the time, the shake would not work. Compass, Motion, and LEDs were always working! 
**IMPROVE** => Kept working on the shake. Read more on how the shaking works to see what I am missing. 

---

### Code to Highlight
```java
        if (userInput < 1 || userInput > 25) {
            System.out.println("Invalid input. Please enter a number from 1 to 25.");
            return;
        }
        setDisplay(led, userInput, 1);
        bird.setDisplay(led);
        while (!bird.isShaking()) {
            System.out.println("Compass Heading: " + bird.getCompass());
            bird.setMove("F", 999, 50);
            bird.pause(10);
        }
        
        bird.setDisplay(new int[25]);
    }
```

---

### Choose At Least Three of the Following to Include:
- Why did you build this project? => I wanted to learn more about how the Finch robot detects shaking, how compass sensor works, and how we can use LEDs to visually confirm that everything is functioning correctly.
- What problem does it solve? => It helps people see how the Finch robot's sensors work by using lights and movement to show when the robot is shaking or which direction it is facing.
- What did you learn? => I learned how to control the Finch robot using not only SNAP, but also JAVA. I now know how to light up specific LEDs, use a compass sensor, detect when the robot is shaken, and use these features together to create an interactive program.
- What makes your project stand out? => This is NOT generic. We combined multiple Finch robot features like LED display, compass, motion, and shake detection into one interactive program. 
