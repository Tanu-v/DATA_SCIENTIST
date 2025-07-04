import matplotlib.pyplot as plt
import numpy as np

xpoints = np.array([4.5,4.6, 4.7, 5, 4.6,4.2,3.8,4.5,4.6,5.1,6.1,8.0])
ypoints = np.array([5,4.6, 4.5, 4.8, 5.2,5.1,4.3,3,3,3,4.9,8.0])

plt.plot(xpoints, ypoints, marker='*')
plt.show()


