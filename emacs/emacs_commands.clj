;; Emacs commands cheat sheet

;; BUFFER OPERATIONS
;; C-x b                -- list all open buffers
;; C-x k                -- kill buffer
;; M-x <function>       -- executes <function>


;; FILE OPERATIONS
;; C-x C-f              -- open/create file
;; C-x C-s/Cmd + S      -- save file
;; C-x o                -- move to next buffer

;; EDIT OPERATIONS
;; C-a                  -- move to begining of line 
;; M-m                  -- Move to first non-whitespace character on the line
;; C-e                  -- Move to end of line
;; C-f                  -- Move forward one character
;; C-b                  -- Move backward one character
;; M-f                  -- Move forward one word (I use this a lot)
;; M-b                  -- Move backward one word (I use this a lot, too)
;; C-s                  -- Regex search for text in current buffer and move to it. Press C-s again
;;                         to move to next match.
;; C-r                  -- Same as C-s, but search in reverse
;; M-<                  -- Move to beginning of buffer
;; M->                  -- Move to end of buffer
;; M-gg                 -- Go to line
;; Tab                  -- Indent line
;; C-j                  -- New line and indent (equiv to Enter + Tab)
;; M-/                  -- Hippie expands; cycles through possible expansions of the text before
;;                         point
;; M-\                  -- Delete all spaces and whitespace around point


;; REGION OPERATIONS
;; C-w                  -- Kill region
;; M-w                  -- Copy region to kill ring
;; C-y                  -- Yank (paste)
;; M-y                  -- Cycle through kill ring after yanking
;; M-d                  -- Kill word (delete word)
;; C-k                  -- Kill line (dd in vim)

;; HELP
;; C-h k key-binding    -- Describe the function bound to the key binding. To get this
;;                         to work, you actually perform the key sequence after typing
;;                         C-h k.
;; C-h f                -- describe function
