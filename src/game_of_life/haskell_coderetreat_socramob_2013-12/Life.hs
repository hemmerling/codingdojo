
module Main where





data Cell = Alife
          | Dead

data Bool = False | True

type Neighbours = Int



-- kommentar
-- | doku
-- doku
-- >>> rule 3 undefined
-- Alife
rule :: Neighbours -> Cell -> Cell
rule 3 _ = Alife
rule 2 c = c
rule _ _ = Dead




data Grid a = G (Line (Line a))
data Line a = L [(Int,a)]  

instance Functor Grid where
   fmap f (G x) = G (fmap (fmap f) lla)

instance Functor Line where
 ...
 
zipLine :: (a,b) -> (a->b->c)  ->  Line a  ->  Line b  ->  Line c
zipGrid :: ...


filterGrid :: (a -> Bool) -> Grid a -> Grid a


neighbours :: (Int,Int) -> ...





 



