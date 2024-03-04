public class Circle {

        private double radius;

        //costructor

        public  Circle( )
        {
            radius = 1.0;
        }
        public  Circle(double newRadius)
        {
            radius = newRadius;
        }

        ///method get the radius
        public  double getRadius (){
            return  radius;
        }

        //method to calculate the area
        public double calculatethearea(){
            return  Math.PI*radius*radius;
        }

        public double calculateCircmistance(){
            return 2*Math.PI*radius;
        }
    }
